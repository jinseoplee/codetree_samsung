// https://www.codetree.ai/cote/13/problems/rainy-day/description

import java.util.Scanner;

// Forecast 정보를 나타내는 클래스 선언
class Forecast {
    String date, day, weather;
    Forecast(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
};

public class Main {
    public static Forecast ans = new Forecast("9999-99-99", "", "");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            // Forecast 객체를 만들어 줍니다.
            Forecast f = new Forecast(date, day, weather);
            if(weather.equals("Rain")) {
                // 비가 오는 경우 가장 최근인지 확인하고,
                // 가장 최근일 경우 정답을 업데이트합니다.
                if(ans.date.compareTo(f.date) > 0)
                    ans = f;
            }
        }

        // 결과를 출력합니다.
        System.out.print(ans.date + " " + ans.day + " " + ans.weather);
    }
}