package bridge;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(int [] upCase, int [] downCase, int count){
        System.out.printf("%s","[ ");
        printBridge(upCase, count);
        System.out.printf("%s", "]\n");
        System.out.printf("%s", "[ ");
        printBridge(downCase, count);
        System.out.printf("%s", "]\n");
    }
    public void printBridge(int [] bridgeCase, int count){
        for(int i = 0; i < count; i++){
            if(bridgeCase[i] == 1){
                System.out.printf("%s", "O ");
            }
            if(bridgeCase[i] == 0){
                System.out.printf("%s", "  ");
            }
            if(i < count - 1) {
                System.out.printf("%s", "| ");
            }
            if(bridgeCase[i] == 2){
                System.out.printf("%s", "X ");
            }
        }
    }
    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMapResult() {
        System.out.println("최종 게임 결과");
    }
    public void printGameSuccess(){
        System.out.println("게임 성공 여부: 성공");
    }
    public void printGameFailed(){
        System.out.println("게임 성공 여부: 실패");
    }
    public void printGameTries(int gameCount){
        System.out.println("총 시도한 횟수: " + gameCount);
    }
    public void printStart(){
        System.out.println("다리 건너기 게임을 시작합니다.");
    }
    public void printAskBridgeLength() {
        System.out.println("다리의 길이를 입력해주세요.");
    }
    public void printAskMovingButton(){
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
    }
    public void printAskGameRestart(){
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
    }
    public void printSuccessResult(int [] upCase, int [] downCase, int gameCount){
        System.out.println("최종 게임 결과");
        printMap(upCase, downCase, upCase.length);
        System.out.println("게임 성공 여부: 성공");
        System.out.println("총 시도한 횟수: " + gameCount);
    }
}