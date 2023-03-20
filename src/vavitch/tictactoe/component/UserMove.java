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

import java.util.Scanner;


/**
 * @author vavitch
 * @link vavitch@yahoo.com
 */
public class UserMove {

    private int[][] temp = {{7, 8, 9},
            {4, 5, 6},
            {1, 2, 3}};


    public void make(final GameTable gameTable) {
        int num;
        while (true) {
            while (true) {
                System.out.println("Please type number between 1 and 9:");
                Scanner in = new Scanner(System.in);
                String enter = in.nextLine();
                if (enter.length() == 1 && isDigit(enter) && Integer.valueOf(enter) > 0 && Integer.valueOf(enter) > 0) {
                    num = Integer.valueOf(enter);
                    break;

                } else {
                    System.out.println("enter a valid number");
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (num == temp[i][j] && gameTable.isEmpty(new Cell(i, j))) {
                        gameTable.setSign(new Cell(i, j), 'X');
                        return;
                    } else if (num == temp[i][j]) {
                        System.out.println("Can't make a move, because the cell is not free! Try again!");
                    }
                }

            }
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

     /*   Cell cell1 = new Cell(2, 0);
        Cell cell2 = new Cell(2, 1);
        Cell cell3 = new Cell(2, 2);
        Cell cell4 = new Cell(1, 0);
        Cell cell5 = new Cell(1, 1);
        Cell cell6 = new Cell(1, 2);
        Cell cell7 = new Cell(0, 0);
        Cell cell8 = new Cell(0, 1);
        Cell cell9 = new Cell(0, 2);

        while (true) {

            System.out.println("Please type number between 1 and 9:");
            Scanner in = new Scanner(System.in);



            switch (in.nextInt()) {
                case 1:
                    if (gameTable.isEmpty(cell1)) {
                        gameTable.setSign(cell1, 'X');
                        return;
                    } else {
                        message();
                    }
                    break;
                case 2:
                    if (gameTable.isEmpty(cell2)) {
                        gameTable.setSign(cell2, 'X');
                        return;
                    } else {
                        message();
                    }
                    break;
                case 3:
                    if (gameTable.isEmpty(cell3)) {
                        gameTable.setSign(cell3, 'X');
                        return;
                    } else {
                        message();
                    }
                    break;
                case 4:
                    if (gameTable.isEmpty(cell4)) {
                        gameTable.setSign(cell4, 'X');
                        return;
                    } else {
                        message();
                    }
                    break;
                case 5:
                    if (gameTable.isEmpty(cell5)) {
                        gameTable.setSign(cell5, 'X');
                        return;
                    } else {
                        message();
                    }
                    break;
                case 6:
                    if (gameTable.isEmpty(cell6)) {
                        gameTable.setSign(cell6, 'X');
                        return;
                    } else {
                        message();
                    }
                    break;
                case 7:
                    if (gameTable.isEmpty(cell7)) {
                        gameTable.setSign(cell7, 'X');
                        return;
                    } else {
                        message();
                    }
                    break;
                case 8:
                    if (gameTable.isEmpty(cell8)) {
                        gameTable.setSign(cell8, 'X');
                        return;
                    } else {
                        message();
                    }
                    break;
                case 9:
                    if (gameTable.isEmpty(cell9)) {
                        gameTable.setSign(cell9, 'X');
                        return;
                    } else {
                        message();
                    }
                    break;
                default:
                    break;


            }
        }
    }
     private void message() {
        System.out.println("Can't make a move, because the cell is not free! Try again!");
    }
    */



