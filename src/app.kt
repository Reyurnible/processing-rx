import processing.core.PApplet

fun main(args: Array<String>) {
    PApplet.main(arrayOf("--present", "AppSketch"));
}

class AppSketch : PApplet() {

    override fun settings() {
        size(200, 200)
    }

    override fun setup() {
        background(0)
    }

    override fun draw() {
        stroke(255)
        if (mousePressed) {
            line(mouseX.toFloat(), mouseY.toFloat(), pmouseX.toFloat(), pmouseY.toFloat());
        }
    }

}