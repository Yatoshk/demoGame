package com.example.demoGame.repository;

import com.example.demoGame.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.awt.print.Book;
import java.util.List;

@SpringBootApplication
public class ApplyDataSource implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(ApplyDataSource.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String sql = " ";
        int result = jdbcTemplate.update(sql);
        if (result > 0) {
            System.out.println("A new row has been inserted.");
        }
    }
    /*
    public void addPlayer(String login, String password, String name) throws Exception{
        /*String sql = "insert into players values('"+ player.getLogin() + "', '"+ player.getPassword() +"', '"+ player.name+"')";
        int result = jdbcTemplate.update(sql);
        if (result > 0) {
            System.out.println("Insert successfully.");
        }*/
/*
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("players");

        Player player = new Player(login, password, name);
        BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(player);
        int result = insertActor.execute(paramSource);
        if (result > 0) {
            System.out.println("Insert successfully.");
        }
    }
    *//*
    public void testListAll() {
        String sql = "select * from players";

        List<Player> listPlayers = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Player.class));
        for (Player player : listPlayers) {
            System.out.println(player);
        }
    }
    */
}
