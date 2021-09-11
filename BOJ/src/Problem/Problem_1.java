package Problem;

/* 간단한 콘서트 예약 시스템 */
/* 공연 하루에 한 번 있다. 좌석은 S석, A석, B석으로 나뉘며 . 각 10개의 좌석이 있다.
 * 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기" 가 있다.
 * 예약은 한 자리만 가능하고, 좌석 타입, 예약자 이름, 좌석 번호를 순서대로 입력받아
 * 예약한다.
 * 조회는 모든 좌석을 출력한다. 취소는 예약자 이름을 입력받아 취소한다.
 * 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오휴 메시지를 출력하고
 * 사요앚가 다시 시도하도록 한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 출력 예시*/
/* 명품콘서트홀 예약시스템 입니다.
 * 예약:1, 조회:2, 취소:3, 끝내기:4>>1
 * 좌석구분 S(1), A(2), B(3) >>1
 *
 * S>> --- --- --- ---- ---- --- --- --- --- ---
 * 이름 >> 황기태
 * 번호 >> 1
 * 예약: 1, 조회2, 취소:3, 끝내기:4 >> 1
 * 좌석구분 S(1), A(2), B(3) >>2
 *
 * A>> --- --- --- --- --- --- --- --- --- --- ---
 * 이름 >> 김효수
 * 번호 >> 5
 * 예약: 1, 조회2, 취소:3, 끝내기:4 >> 2
 * 좌석구분 S(1), A(2), B(3) >>2
 */
public class Problem_1 {
    static Concert concert = new Concert();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("명품콘서트홀 예약 시스템 입니다.");

        boolean isContinue = true;
        while(isContinue){
            int start = start(bufferedReader);

            switch (start){
                case 1:
                    reservation(bufferedReader);
                    break;
                case 2:
                    concert.inquiry();
                    break;
                case 3:
                    if(concert.isSeat()){
                        System.out.println("예약된 좌석이 없습니다. 다시 선택해 주세요");
                        continue;
                    }
                    cancel(bufferedReader);
                    break;
                case 4:
                    isContinue = false;
                    break;
            }
        }
    }

    // 시작
    private static int start(BufferedReader bufferedReader) {
        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
            try{
                int start = Integer.parseInt(bufferedReader.readLine());
                if(start <= 0 || start > 4){
                    errorMessage();
                    continue;
                }

                return start;
            }catch (Exception e){
                errorMessage();
            }
        }
    }

    // 조회
    private static void reservation(BufferedReader bufferedReader) {
        while(true){
            System.out.print("좌석구분 S(1), A(2), B(3) >> ");
            try{
                int type = Integer.parseInt(bufferedReader.readLine());
                if(type <= 0 && type > 3){
                    errorMessage();
                    continue;
                }

                if(concert.isNonSeat(type)){
                    System.out.println("예약 좌석이 꽉 차있습니다. 다른 좌석을 선택해 주세요");
                    continue;
                }

                concert.viewSeat(type);

                String name = getName(bufferedReader);
                int number = getNumber(bufferedReader, type);

                concert.reservation(type,name,number);

                break;
            }catch (Exception e){
                errorMessage();
            }
        }
    }

    private static void cancel(BufferedReader bufferedReader) {
        while(true){
            System.out.print("이름 >> ");
            try {
                String name = bufferedReader.readLine();
                if(name == null || "".equals(name)){
                    errorMessage();
                    continue;
                }

                if(!concert.isName(name)){
                    System.out.println("해당 이름으로 예약된 좌석이 없습니다. 다시 입력해 주세요.");
                    continue;
                }

                concert.cancel(name);
                break;
            }catch (Exception e){
                errorMessage();
                continue;
            }
        }
    }

    private static int getNumber(BufferedReader bufferedReader, int type) {
        while(true){
            System.out.print("번호 >> ");
            try {
                int number = Integer.parseInt(bufferedReader.readLine());
                if(number < 1 || number > concert.seats[0].length){
                    errorMessage();
                    continue;
                }
                number--;
                if(concert.isSeat(type, number)){
                    continue;
                }

                return number;
            }catch (Exception e){
                errorMessage();
                continue;
            }
        }
    }

    private static String getName(BufferedReader bufferedReader) {
        while(true){
            System.out.print("이름 >> ");
            try {
                String name = bufferedReader.readLine();
                if(name == null || "".equals(name)){
                    errorMessage();
                    continue;
                }
                return name;
            }catch (Exception e){
                errorMessage();
                continue;
            }
        }
    }

    private static void errorMessage() {
        System.out.println("입력값이 잘못었습니다. 다시 입력해주세요.");
    }

}

