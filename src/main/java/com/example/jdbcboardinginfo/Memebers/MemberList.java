package com.example.jdbcboardinginfo.Memebers;

import com.example.jdbcboardinginfo.Utils.DbUtilsModule12;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberList {
    List<Member> memberList = new ArrayList<>();

    public List<Member> getData(int nextPage) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        try {
            DataSource dataSource = DbUtilsModule12.getDataSource();
            connection = dataSource.getConnection();

            String sqlQuery = "select id, name, city from Members LIMIT ? OFFSET ?;";

            statement = connection.prepareStatement(sqlQuery);
            statement.setInt(1,20);
            statement.setInt(2,nextPage);
            result = statement.executeQuery();

            while (result.next()) {
                this.memberList.add(new Member(result.getInt(1),
                        result.getString(2),
                        result.getString(3)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                result.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return memberList;
    }
}
