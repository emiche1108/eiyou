package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Comment;


public class CommentDAO {
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "root";
        String password = "password";
        return DriverManager.getConnection(url, username, password);
    }

    public List<Comment> getCommentsByColor(String color) {
        List<Comment> comments = new ArrayList<>();
        String sql = "SELECT * FROM comments WHERE color = ?"; // 仮のテーブルとカラム名
        
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, color);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Comment comment = new Comment();
                comment.setId(resultSet.getInt("id"));
                comment.setText(resultSet.getString("text"));
                comment.setColor(resultSet.getString("color"));
                comments.add(comment);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comments;
    }
}
