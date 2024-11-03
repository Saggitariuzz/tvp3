public class Machine {

    private State currentState;

    //Начальное состояние
    public Machine(){
        currentState = State.S;
    }

    //Если есть проход - {@code return 0}.
    //Если нет - {@code return -1}.
    public int changeState(char st){
        switch (currentState){
            case S -> {
                if(st == '5') currentState = State.A;
                else return -1;
            }
            case A -> {
                if(st == '5') currentState = State.B;
                else return -1;
            }
            case B -> {
                if(st == '6') currentState = State.Z;
                else return -1;
            }
            case Z -> {
                if(st == '6') currentState = State.DE;
                else return -1;
            }
            case DE ->{
                if(st == '5') currentState = State.F;
                else return -1;
            }
            case F -> {
                if(st == '5') currentState = State.B;
                else if(st == '6') currentState = State.G;
                else return -1;
            }
            case G -> {
                if(st == '5') currentState = State.Z;
                else return -1;
            }
            default -> {
                currentState = State.S;
                return -1;
            }
        }
        return 0;
    }

    public State getCurrentState() {
        return currentState;
    }
}
