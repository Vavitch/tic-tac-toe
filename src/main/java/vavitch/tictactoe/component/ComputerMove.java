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

import java.util.Random;

/**
 * @author vavitch
 * @link vavitch@yahoo.com
 */
public class ComputerMove {

    public void make(final GameTable gameTable) {

        while (true) {
            final Cell cell = new Cell(new Random().nextInt(3), new Random().nextInt(3));
            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, 'O');
                return;
            }
        }
    }
}
