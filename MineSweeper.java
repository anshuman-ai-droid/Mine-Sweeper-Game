import java.io.*;
import java.util.*;
class Minesweeper 
{
public static void main(String[] ab)throws Exception
{
Scanner sc = new Scanner(System.in);
System.out.println("         ***************************************************************************************************************************************************************"); 
System.out.println("         ***************************************************************************************************************************************************************"); 
System.out.println("         ***                                                                                                                                                         ***"); 
System.out.println("         ***                                    ||    || |||||| ||     |||||| ||||||| |||  ||| ||||||  |||||| |||||||                                                ***");
System.out.println("         ***                                 |  ||    || ||     ||     ||     ||   || || || || ||        ||   ||   ||  |                                             ***");
System.out.println("         ***                               --   ||    || ||||   ||     ||     ||   || ||    || ||||      ||   ||   ||   --                                           ***");
System.out.println("         ***                                 |  || || || ||     ||     ||     ||   || ||    || ||        ||   ||   ||  |                                             ***");
System.out.println("         ***                                    |||  ||| |||||| |||||| |||||| ||||||| ||    || ||||||    ||   |||||||                                                ***");
System.out.println("         ***                                                                                                                                                         ***");
System.out.println("         ***************************************************************************************************************************************************************");
System.out.println("         ***************************************************************************************************************************************************************");
System.out.println("         ***                                                                                                                                                         ***");                                                               
System.out.println("         ***  |||||      ||||| ||||||||| |||||         ||| |||||||||||    ||||||||||| |||            ||| ||||||||||| ||||||||||| |||||||||| ||||||||||| ||||||||||   ***");                                                                  
System.out.println("         ***  ||| ||    || |||    |||    ||| ||        ||| |||            |||         |||            ||| |||         |||         |||    ||| |||         |||    |||   ***");                                                               
System.out.println("         ***  |||  ||  ||  |||    |||    |||  ||       ||| |||            |||         |||            ||| |||         |||         |||    ||| |||         |||    |||   ***");
System.out.println("         ***  |||   ||||   |||    |||    |||   ||      ||| |||            |||         |||            ||| |||         |||         |||    ||| |||         |||    |||   ***");
System.out.println("         ***  |||          |||    |||    |||    ||     ||| |||            |||         |||            ||| |||         |||         |||    ||| |||         |||    |||   ***");
System.out.println("         ***  |||          |||    |||    |||     ||    ||| |||||||    --  ||||||||||| |||    ||||    ||| |||||||     |||||||     |||||||||| |||||||     ||||||||||   ***");
System.out.println("         ***  |||          |||    |||    |||      ||   ||| |||                    ||| |||   ||  ||   ||| |||         |||         |||        |||         |||   ||     ***");
System.out.println("         ***  |||          |||    |||    |||       ||  ||| |||                    ||| |||  ||    ||  ||| |||         |||         |||        |||         |||    ||    ***");
System.out.println("         ***  |||          |||    |||    |||        || ||| |||                    ||| ||| ||      || ||| |||         |||         |||        |||         |||     ||   ***");
System.out.println("         ***  |||          |||    |||    |||         ||||| |||                    ||| |||||        ||||| |||         |||         |||        |||         |||      ||  ***");
System.out.println("         ***  |||          ||| ||||||||| |||          |||| |||||||||||    ||||||||||| ||||          |||| ||||||||||| ||||||||||| |||        ||||||||||| |||       || ***");
System.out.println("         ***                                                                                                                                                         ***");                                                               
System.out.println("         ***************************************************************************************************************************************************************");
System.out.println("         ***************************************************************************************************************************************************************");

System.out.println();
System.out.println("                                                                        Developed by:-Anshuman Tripathi");
Thread.sleep(50);
System.out.println();
System.out.println("               How To Play?");
Thread.sleep(50);
System.out.println("               To play minesweeper perform the functions listed below.\n               Search the mines to earn the points.");
System.out.println();
System.out.println("               Instructions");
Thread.sleep(50);
System.out.println("               1.Enter 1 to start the game.If you hit the mine then points will be awarded.\n               2.If you are confirm that the mine is present on the entered co-ordinates then enter 2 to place the flag\n               3.If you have any sort of doubt then enter 3 to place a question mark.\n               4.Enter 4 to save the game which can be loaded back when you play the game next time.\n               5.Enter 5 to load the previous game which was saved.\n               6.Enter 6 to exit the game");
Thread.sleep(50);
System.out.println();
System.out.print("               Enter number of rows: ");
Thread.sleep(50);
int rows = sc.nextInt();
System.out.print("               Enter number of columns: ");
Thread.sleep(50);
int cols = sc.nextInt();
System.out.print("               Enter number of mines ");
Thread.sleep(50);
int mines = sc.nextInt();
char[][] a = new char[rows][cols];
char[][] ar = new char[rows][cols];
for (int i = 0; i < rows; i++) 
{
   for (int j = 0; j < cols; j++) 
   {
      a[i][j] = '|';
      ar[i][j] = '_';
            }
        }
 Random rand = new Random();
 int minesPlaced = 0;
  while (minesPlaced < mines)
{
  int row = rand.nextInt(rows);
  int col = rand.nextInt(cols);
  if (a[row][col] != 'B') 
{
       a[row][col] = 'B';
       minesPlaced++;
for (int i = -1; i <= 1; i++) 
{
 for (int j = -1; j <= 1; j++) 
  {
     int r = row + i;
     int c = col + j;
if (r >= 0 && r < rows && c >= 0 && c < cols && a[r][c] != 'B') 
{
     a[r][c] = (char) (a[r][c] + 1);
                        }
                    }
                }
            }
        }

 int score = 0;
 boolean gameOver = false;
 while (!gameOver) 
{
 System.out.println("\n               Current Grid:");
 for (int i = 0; i < rows; i++) 
{
 for (int j = 0; j < cols; j++) 
 {
//System.out.print("               ");
   System.out.print(ar[i][j] + " ");
                }
  System.out.println();
      }
 System.out.println("\n               Choose an option among the following:");
 System.out.println("               1. To Play");
 System.out.println("               2.To Place a flag");
 System.out.println("               3.To Place a question mark");
 System.out.println("               4.To Save game");
 System.out.println("               5.To Load Game");
 System.out.println("               6.To Exit");
System.out.print("               ");
 int ch = sc.nextInt();
switch (ch) 
{
  case 1: 
  System.out.println("               Enter row and column to play: ");
  int row = sc.nextInt();
  int col = sc.nextInt();
  row--;
  col--;

  if (row < 0 || row >= rows || col < 0 || col >= cols || ar[row][col] != '_') 
{
  System.out.println("               Oops !!Wrong move Try again.");
  continue;
                }
 if (a[row][col] == 'B') 
{
score=score+10;
System.out.println("               Congratulations!! You hit the mine."); 
System.out.println("               Final Score : "+score);
gameOver = true;
                    } 

else 
{
reveal(a, ar, row, col, rows, cols);
if (checkWin(a, ar, rows, cols)) 
{
System.out.println("               Congratulations! You won.");
gameOver = true;
                        }
                    }
break;
case 2: 
 System.out.println("               Enter row and column to place a flag :");
 int fr = sc.nextInt(); 
fr--;
 int fc = sc.nextInt(); 
fc--;
 if (fr < 0 || fr>= rows || fc < 0 || fc >= cols || ar[fr][fc] != '_') 
{
    ar[fr][fc] = 'F';

   System.out.println("              Oops!! wrong move. Try again.");
   continue;
                    }

    if (a[fr][fc] == 'B') 
{
   score += 5;
   System.out.println("               Correct flag! +5 points.");
                    }
 else 
{
   System.out.println("               Incorrect flag placement -1 point.");
                        score-=1;
                    }
  break;
 case 3: 
 System.out.println("               Enter row and column to place a question mark: ");
 int qr= sc.nextInt(); 
qr--;
 int qc = sc.nextInt(); 
qc--;
if (qr < 0 || qr >= rows || qc < 0 || qc >= cols || ar[qr][qc] != '_') 
{
   ar[qr][qc] = '?';

   System.out.println("               Oops!! Wrong move. Try again.");
   continue;
                    }
    break;
case 4: 
  saveGame(a, ar, rows, cols, score, "minesweeper_save.txt");
  System.out.println("               Your game has been saved successfully");
   break;
case 5: 
  score = loadGame(a, ar, rows, cols, "minesweeper_save.txt");
  System.out.println("               Game loaded successfully.");
   break;
case 6: 
 System.out.println("               Thank you for playing! Final score: " + score);
 gameOver = true;
 break;

default:
System.out.println("               Wrong input Try again.");
            }
        }

        sc.close();
    }

   static void reveal(char[][] a, char[][] ar, int row, int col, int rows, int cols) 
{
        if (row < 0 || row >= rows || col < 0 || col >= cols || ar[row][col] != '_') 
{
            return;
        }

        ar[row][col] = a[row][col];

        if (a[row][col] == '0') {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    reveal(a, ar, row + i, col + j, rows, cols);
                }
            }
        }
    }

    static boolean checkWin(char[][] a, char[][] ar, int rows, int cols) 
{
        for (int i = 0; i < rows; i++) 
{
            for (int j = 0; j < cols; j++) 
{
                if (a[i][j] != 'B' && ar[i][j] == '-') 
{
                    return false;
                }
            }
        }
        return true;
    }

    static void saveGame(char[][] a, char[][] ar, int rows, int cols, int score, String filename)
 {
        try (FileWriter fw = new FileWriter(filename)) 
{
            fw.write(rows + " " + cols + " " + score + "\n");

            for (int i = 0; i < rows; i++) 
{
                for (int j = 0; j < cols; j++) 
{
                    fw.write(a[i][j]);
                }
                fw.write("\n");
            }

            for (int i = 0; i < rows; i++) 
{
                for (int j = 0; j < cols; j++) 
{
                    fw.write(ar[i][j]);
                }
                fw.write("\n");
            }
        } 
catch (IOException e) 
{
            System.out.println("               Error saving game: " + e.getMessage());
        }
    }

    static int loadGame(char a[][], char ar[][] , int rows, int cols, String filename) {
        int score = 0;
        try (FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr)) {
            String[] d = br.readLine().split(" ");

   if (Integer.parseInt(d[0]) != rows || Integer.parseInt(d[1]) != cols) 
{
                System.out.println("               Saved game dimensions do not match current dimensions.");
                return score;
            }

            score = Integer.parseInt(d[2]);

 for (int i = 0; i < rows; i++) 
{
  String line = br.readLine();
  for (int j = 0; j < cols; j++) 
{
   a[i][j] = line.charAt(j);
                }
            }

 for (int i = 0; i < rows; i++) 
{
 String line = br.readLine();
 for (int j = 0; j < cols; j++) 
{
 ar[i][j] = line.charAt(j);
                }
            }
        } 
catch (IOException e) 
{
 System.out.println("               Error loading your game: " + e.getMessage());
        }
        return score;
    }
}
