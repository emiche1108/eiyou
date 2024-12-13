package main;

import java.time.LocalTime;


public class GreetingUtil {
    public static String generateGreetingMessage() {
        LocalTime now = LocalTime.now();
        if (now.isBefore(LocalTime.NOON)) {
            return "おはようございます！元気が出る朝の一品を提案します。";
        } else if (now.isBefore(LocalTime.of(18, 0))) {
            return "こんにちは～。お昼ごはんの副菜を提案します。";
        } else {
            return "お疲れ様です。今夜の副菜をご提案しましょうか？";
        }
    }
}
