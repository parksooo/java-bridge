package bridge;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    OutputView printMessage = new OutputView();

    public static void main(String[] args) {
        BridgeGame test = new BridgeGame();
        test.play();
    }
    public void play(){
        InputView inputView = new InputView();
        BridgeMaker bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
        printMessage.printStart();
        printMessage.printAskBridgeLength();
        List<String> bridge = bridgeMaker.makeBridge(inputView.readBridgeSize(Console.readLine()));
        System.out.println(bridge);
        int [] upCase = new int[bridge.size()];
        int [] downCase = new int[bridge.size()];
        printMessage.printAskMovingButton();
        int length = 1;
        int gameCount = 1;
        for (int i = 0; i < bridge.size(); i++) {
            String input = Console.readLine();
            if(!move(bridge.get(i), input)){
                if(input.equals("U"))
                    upCase[i] += 2;
                if(input.equals("D"))
                    downCase[i] += 2;
                printMessage.printMap(upCase, downCase, length);
                gameCount++;
                return;
            }
            if(bridge.get(i).equals("U")){
                upCase[i]++;
            }
            if(bridge.get(i).equals("D")){
                downCase[i]++;
            }
            printMessage.printMap(upCase, downCase, length);
            length++;
        }
        printMessage.printMapResult();
        printMessage.printMap(upCase, downCase, length - 1);
        printMessage.printGameResult();
        printMessage.printGameTries(gameCount);
    }
    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(String answerBridge, String moveCommand) {
        if(answerBridge.equals(moveCommand)){
            return true;
        }
        return false;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}
