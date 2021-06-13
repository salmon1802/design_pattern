package com.salmon.design.principle.demeter;

/**
 * @date 2021-6-13 - 23:31
 * Created by Salmon
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
