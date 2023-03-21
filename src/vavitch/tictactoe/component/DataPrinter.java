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

import vavitch.tictactoe.keypad.CellNumberConverter;
import vavitch.tictactoe.model.Cell;
import vavitch.tictactoe.model.GameTable;

/**
 * @author vavitch
 * @link vavitch@yahoo.com
 */
public class DataPrinter {

    private final CellNumberConverter cellNumberConverter;

    public DataPrinter(final CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    public void printMappingTable() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            System.out.println("| " + cellNumberConverter.toNumber(new Cell(i, 0)) +
                    " | " + cellNumberConverter.toNumber(new Cell(i, 1)) +
                    " | " + cellNumberConverter.toNumber(new Cell(i, 2)) + " |");
        }
        System.out.println("-------------");

    }


    public void printGameTable(final GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            System.out.println("| " + gameTable.getSign(new Cell(i, 0)) +
                    " | " + gameTable.getSign(new Cell(i, 1)) +
                    " | " + gameTable.getSign(new Cell(i, 2)) + " |");
        }
        System.out.println("-------------");

    }
}
