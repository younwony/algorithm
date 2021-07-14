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

    // seat 조회
    public void viewSeat(int type) {
        StringBuilder seatStr = new StringBuilder();
        for (String seat : seats[type]) {
            seatStr
                    .append("-".equals(seat) ? "-" : (" ".equals(seat) ? " " : "o"));
        }
        System.out.println(seatType[type] + " >> " + seatStr.toString());
    }

    public boolean isNonSeat(int type) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String seat : seats[type]) {
            stringBuilder.append(seat);
        }
        return stringBuilder
                .toString()
                .indexOf("-") == -1;
    }

    public boolean isSeat(int type, int number) {
        return !"-".equals(seats[type][number]);
    }

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
}
