/*
 * Copyright (c) 2023. vavitch@yahoo.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package vavitch.tictactoe.component;

import vavitch.tictactoe.model.Cell;
import vavitch.tictactoe.model.GameTable;

/**
 * @author vavitch
 * @link vavitch@yahoo.com
 */
public class WinnerVerifier {

    public boolean isUserWin(final GameTable gameTable) {
        return winner(gameTable, 'X');
    }

    public boolean isComputerWin(final GameTable gameTable) {
        return winner(gameTable, 'O');
    }

    private boolean winner(final GameTable gameTable, final char sign) {

        int countIJ = 0;

        for (int i = 0; i < 3; i++) {
            int countJ = 0;
            int countI = 0;

            for (int j = 0; j < 3; j++) {
                if (gameTable.getSign(new Cell(i, j)) == sign) {
                    countJ++;
                    if (countJ == 3) {
                        return true;
                    }
                }
                if (gameTable.getSign(new Cell(j, i)) == sign) {
                    countI++;
                    if (countI == 3) {
                        return true;
                    }
                }
                if (i == j && gameTable.getSign(new Cell(i, j)) == sign) {
                    countIJ++;
                    if (countIJ == 3) {
                        return true;
                    }
                }
            }
        }
        if (gameTable.getSign(new Cell(0, 2)) == gameTable.getSign(new Cell(2, 0)) &&
                gameTable.getSign(new Cell(0, 2)) == gameTable.getSign(new Cell(1, 1)) &&
                gameTable.getSign(new Cell(0, 2)) == sign) {
            return true;
        }
        return false;
    }
}
