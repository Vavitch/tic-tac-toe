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

/**
 * @author vavitch
 * @link vavitch@yahoo.com
 */
public class CellNumberConverter {
    private int[][] temp = {{7, 8, 9},
            {4, 5, 6},
            {1, 2, 3}};

    public Cell toCell(final int number) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (temp[i][j] == number) {
                    return new Cell(i, j);
                }
            }
        }
        return null;
    }

    public int toNumber(final Cell cell) {
        return temp[cell.getRow()][cell.getCol()];
    }

}
