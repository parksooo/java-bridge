package bridge;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    public void printMap(BridgeDTO bridgeDTO){
        System.out.printf("%s", MessageCase.LEFTBRACKET.getMessage() + " ");
        printBridge(bridgeDTO.getUpCase(), bridgeDTO.getLength());
        System.out.printf("%s", MessageCase.RIGHTBRACKET.getMessage() + "\n");
        System.out.printf("%s", MessageCase.LEFTBRACKET.getMessage() + " ");
        printBridge(bridgeDTO.getDownCase(), bridgeDTO.getLength());
        System.out.printf("%s", MessageCase.RIGHTBRACKET.getMessage() + "\n\n");
    }

    public void printBridge(BridgeCase [] bridgeCase, int length){
        for(int i = 0; i < length; i++){
            System.out.printf("%s", bridgeCase[i] + " ");
            if(i < length - 1) {
                System.out.printf("%s", MessageCase.DIVISION.getMessage() + " ");
            }
        }
    }
    public void printStart(){
        System.out.println(MessageCase.START.getMessage() + "\n");
    }
    public void printAskBridgeLength() {
        System.out.println(MessageCase.BRIDESIZE.getMessage());
    }
    public void printAskMovingButton(){
        System.out.println(MessageCase.MOVE.getMessage());
    }
    public void printAskGameRestart(){
        System.out.println(MessageCase.RESTART.getMessage());
    }
    public void printSuccessedResult(BridgeDTO bridgeDTO ){
        System.out.println(MessageCase.RESULT.getMessage());
        printMap(bridgeDTO);
        System.out.println(MessageCase.GAMESUCCESS.getMessage());
    }
    public void printFailedResult(BridgeDTO bridgeDTO){
        System.out.println(MessageCase.RESULT.getMessage());
        printMap(bridgeDTO);
        System.out.println(MessageCase.GAMEFAILED.getMessage());
    }
    public void printGameCount(int gameCount){
        System.out.println(MessageCase.GAMETRY.getMessage() + gameCount);
    }
}