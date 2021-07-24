package Problem;

public class Concert {
    // S(1), A(2), B(3)
    String[] seatType = {"","S","A","B"};
    String[][] seats = new String[4][44];

    public Concert() {
        for (int i = 0; i < seats.length; i++) {
            seats[i] = "--- --- --- --- --- --- --- --- --- --- ---".split("");
        }
    }

    // 예약
    void reservation(int type, String name, int number){
        seats[type][number] = name;
    }

    // 조회
    void inquiry(){
        for (int i = 1; i < seats.length; i++) {
            viewSeat(i);
        }
    }

    // 취소
    void cancel(String name){
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats.length; j++) {
                if(name.equals(seats[i][j])){
                    seats[i][j] = "-";
                }
            }
        }
    }

    // 주어진 타입의 좌석 출력
    public void viewSeat(int type) {
        StringBuilder seatStr = new StringBuilder();
        for (String seat : seats[type]) {
            seatStr
                    .append("-".equals(seat) ? "-" : (" ".equals(seat) ? " " : "o"));
        }
        System.out.println(seatType[type] + " >> " + seatStr.toString());
    }

    // 주어진 타입에 빈좌석이 있는지 체크
    public boolean isNonSeat(int type) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String seat : seats[type]) {
            stringBuilder.append(seat);
        }
        return stringBuilder
                .toString()
                .indexOf("-") == -1;
    }
    
    // 주어진 타입의 좌석 번호가 빈 좌석인지 체크
    public boolean isSeat(int type, int number) {
        String seat = seats[type][number];
        if("-".equals(seat)){
            return false;
        }

        if(" ".equals(seat)){
            System.out.println("좌석이 아닙니다. 다른 번호를 선택해 주세요");
        }else{
            System.out.println("이미 예약된 좌석입니다. 다른 번호를 선택해 주세요");
        }
        return true;
    }

    // 예약된 사람 있는지 체크
    public boolean isName(String name) {
        for (String[] seat : seats) {
            for (String seatName : seat) {
                if(name.equals(seatName)){
                    return true;
                }
            }
        }
        return false;
    }

    // 예약되있는 좌석 있는지 체크
    public boolean isSeat() {
        for (int i = 1; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if(!"-".equals(seats[i][j]) && !" ".equals(seats[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
}
