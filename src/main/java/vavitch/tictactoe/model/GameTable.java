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

package vavitch.tictactoe.model;

import java.util.Arrays;

/**
 * @author vavitch
 * @link vavitch@yahoo.com
 */
public class GameTable {

    private final char[][] table = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    public boolean isEmpty(final Cell cell) {
        return table[cell.getRow()][cell.getCol()] == ' ';
    }

    public char getSign(final Cell cell) {
        return table[cell.getRow()][cell.getCol()];
    }

    public void setSign(final Cell cell, final char sign) {
        table[cell.getRow()][cell.getCol()] = sign;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GameTable{");

        for (int i = 0; i < table.length; i++) {
            sb.append(Arrays.toString(table[i]));
            if (i < table.length - 1) {
                sb.append(';');
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
