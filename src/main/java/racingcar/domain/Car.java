package racingcar.domain;

import racingcar.utils.constant.Constant;
import racingcar.utils.validation.InputValidation;

public class Car {
    private String name;
    private int moveCount = 0;

    public Car(String name) {
        new InputValidation().validateNameLength(name);
        this.name = name;
    }

    public void move(int randomNumber) {
        new InputValidation().validateRandomNumberRange(randomNumber);
        if (randomNumber >= Constant.MOVE_NUMBER) {
            this.moveCount++;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
