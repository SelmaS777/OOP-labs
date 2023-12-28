package week13.Task5

class TrafficLightContext {
    private var state: TrafficLightState

    init {
        state = RedLightState()
    }

    fun setState(state: TrafficLightState) {
        this.state = state
    }

    fun transitionToRed() {
        state.transitionToRed(this)
    }

    fun transitionToGreen() {
        state.transitionToGreen(this)
    }

    fun transitionToYellow() {
        state.transitionToYellow(this)
    }
}
