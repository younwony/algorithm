package Problem;

import java.util.Scanner;

/*
 * HJ전자는 노트북을 제조, 판매하는 회사이다.
 * 노트북 판매 대수에 상관없이 매월 1000만원의 고정 비용(임대료, 보험료, 재산세)이 들며,
 * 한 대의 노트북을 생산하는데에는 재료비와 인건비 등 총 70만원의 비용이 들고
 * 최초 한대의 노트북 생산 부터 20대를 생산 할 때마다 변동 비용 100만원이 든다 .
 *
 * 노트북을 한 대 생산하는 데는 총 1,170만원이 들며, 21대 생생하는 데는 총 2,670만원이 든다.
 * 노트북 판매 가격이 100만원으로 책정되었다고 한다.
 *
 * 일반적으로 생산 대수를 늘려 가다 보면 총 수익이 총 비용보다 많아지게 된다.
 * 최초로 총 수익이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK- EVEN POINT)이라고 한다.
 * 손익분기점을 구하는 프로그램을 작성하시오 .
 *
 * ---------출력예시 ------------
 * 손익분기점은 노트북 126대 입니다.
 */
public class Problem_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int cnt = 0;
        while(true){
            cnt++;
            if(isProfit(price, cnt)){
                System.out.println("손익분기점은 노트북 " + cnt + "대 입니다.");
                break;
            }
        }
    }

    private static boolean isProfit(int price, int cnt) {
        int produce = 1000 + 70 * cnt + ((cnt-1) / 20 + 1) * 100;
        return  produce < price * cnt;
    }
}
