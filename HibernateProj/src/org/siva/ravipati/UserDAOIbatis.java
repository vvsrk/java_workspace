package org.siva.ravipati;


import com.ibatis.sqlmap.client.SqlMapClient;
 
public class UserDAOIbatis
{
    
    public UserTEO addUser(UserTEO user, SqlMapClient sqlmapClient) {
        try
        {
            Integer id = (Integer)sqlmapClient.queryForObject("user.getMaxId");
            id = id == null ? 1 : id + 1;
            user.setId(id);
            user.setStatus(1);
            sqlmapClient.insert("user.addUser", user);
            //user = getUserById(id, sqlmapClient);
            return user;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
 
    
    public UserTEO getUserById(Integer id, SqlMapClient sqlmapClient) {
        try
        {
            UserTEO user = (UserTEO)sqlmapClient.queryForObject("user.getUserById", id);
            return user;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
 
    
    public void deleteUserById(Integer id, SqlMapClient sqlmapClient) {
        try
        {
            sqlmapClient.delete("deleteUserById", id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}