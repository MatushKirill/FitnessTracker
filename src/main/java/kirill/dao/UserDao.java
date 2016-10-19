package kirill.dao;

import kirill.dto.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by kirill on 10/10/16.
 */
@Repository
public class UserDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public UserDetails getUserByName(String name){
        String sql="SELECT * FROM USER";
        return (UserDetails) jdbcTemplate.query(sql,new UserMaper());

    }


    public void setNewUser(UserDetails userDetails){
        String sql="INSERT INTO users (userName,password,email,rise,age,weigth,sex,activity,calories,enabled)" +
                " VALUES (?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{userDetails.getUserName(), userDetails.getUserPass(),
                            userDetails.getEmail(),userDetails.getRise(),userDetails.getAge(),
                            userDetails.getWeight(),userDetails.getSex(),
                            userDetails.getActivity(),userDetails.getCalories(),userDetails.isEnabled()});
    }

    public List<String> getUsersName(){
        String sql="SELECT userName FROM users";
        return jdbcTemplate.queryForList(sql,String.class);
    }

    public List<String> getUsersEmail(){
        String sql="SELECT email FROM users";
        return jdbcTemplate.queryForList(sql,String.class);
    }

    public void addUserRole(UserDetails user){
        String sql="INSERT INTO authorities (userName,authority) VALUES (?,?)";
        jdbcTemplate.update(sql,new Object[]{user.getUserName(),user.getAuthorities().get(0).getAuthority()});

    }

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final class UserMaper implements RowMapper<UserDetails> {

        public UserDetails mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            UserDetails user=new UserDetails();
            user.setUserName(resultSet.getString("userName"));
            user.setUserName(resultSet.getString("password"));
            user.setUserName(resultSet.getString("email"));
            user.setUserName(resultSet.getString("rise"));
            user.setUserName(resultSet.getString("age"));
            user.setUserName(resultSet.getString("weight"));
            user.setUserName(resultSet.getString("sex"));
            user.setUserName(resultSet.getString("activity"));
            user.setUserName(resultSet.getString("enabled"));
            return user;


        }
    }


}
