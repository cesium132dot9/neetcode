class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        subbox_appeared = [{}, {}, {}, {}, {}, {}, {}, {}, {}]

        i = 0
        while (i < 9): 
            row_appeared = {}
            col_appeared = {}

            j = 0
            while (j < 9): 
                if board[i][j] in row_appeared:
                    print(board[i][j] + " " + str(i) + str(j)) 
                    return False
                elif board[i][j] != '.': 
                    row_appeared[board[i][j]] = 1

                if board[j][i] in col_appeared: 
                    print(board[j][i] + " " + str(j) + str(i))
                    return False 
                elif board[j][i] != '.':  
                    col_appeared[board[j][i]] = 1

                if board[i][j] in subbox_appeared[(i // 3) * 3 + (j // 3)]: 
                    print(board[i][j] + " subbox: " + str(i) + str(j))
                    return False 
                elif board[i][j] != '.': 
                    subbox_appeared[(i // 3) * 3 + (j // 3)][board[i][j]] = 1
                
                j += 1
            
            i += 1
        
        return True