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

import vavitch.tictactoe.model.GameTable;

import java.util.Random;

/**
 * @author vavitch
 * @link vavitch@yahoo.com
 */
public class Game {

    private final DataPrinter dataPrinter;

    private final ComputerMove computerMove;

    private final UserMove userMove;

    private final WinnerVerifier winnerVerifier;

    private final CellEmptyVerifier cellEmptyVerifier;

    public Game(final DataPrinter dataPrinter, final ComputerMove computerMove, final UserMove userMove, final WinnerVerifier winnerVerifier, final CellEmptyVerifier cellEmptyVerifier) {
        this.dataPrinter = dataPrinter;
        this.computerMove = computerMove;
        this.userMove = userMove;
        this.winnerVerifier = winnerVerifier;
        this.cellEmptyVerifier = cellEmptyVerifier;
    }

    public void play() {

        final GameTable gameTable = new GameTable();

        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        dataPrinter.printMappingTable();


        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
        }
        while (true) {
            userMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isUserWin(gameTable)) {
                System.out.println("YOU WIN");
                break;
            }
            if (cellEmptyVerifier.isEmtyCell(gameTable)) {
                System.out.println("DRAW!");
                break;

            }
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isComputerWin(gameTable)) {
                System.out.println("COMPUTER WIN");
                break;
            }
            if (cellEmptyVerifier.isEmtyCell(gameTable)) {
                System.out.println("DRAW!");
                break;

            }

        }
        System.out.println("GAME OVER");


    }

}
