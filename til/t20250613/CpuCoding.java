package til.t20250613;

class CPU{
    public int register=0;
    public int[] memory={5,10,0};

    private static final int LOAD=1;
    private static final int SAVE=2;
    private static final int ADD=3;
    private static final int SUB=4;
    private static final int HALT=5;

    private int[][] program = {
            { LOAD, 0 },         // register = memory[0]
            { ADD, 1 },         // register = register + memory[1]
            { SAVE, 2 },         // memory[2] = register
            { HALT, 0 }         // stop program execution
    };

    public void executeProgram() {
        int pc=0; //program counter

        while(true){
            int opcode=program[pc][0];
            int operand=program[pc][1];

            switch(opcode){
                case LOAD:
                    register=memory[operand];
                    System.out.println("MOV: Loading memory[0] ("+operand+memory[0]+") into register.");
                    break;

                case SAVE:
                    memory[operand] = register;
                    System.out.println("SAVE: register = " + register + " → memory[" + operand + "]");
                    break;
            }
        }
    }
}


public class CpuCoding {
    public static void main(String[] args) {
    }
}
