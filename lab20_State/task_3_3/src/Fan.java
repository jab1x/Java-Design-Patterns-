public class Fan {

    private State state;

    public Fan() {
        this.state = LowState.INSTANCE;
    }

    void setState(State newState) {
        this.state = newState;
    }

    public String getState() {
        return state.getName();
    }

    public void turnUp() {
        state.turnUp(this);
    }

    public void turnDown() {
        state.turnDown(this);
    }
}
