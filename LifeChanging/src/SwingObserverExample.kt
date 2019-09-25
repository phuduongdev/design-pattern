import java.awt.BorderLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JFrame

fun main(args: Array<String>) {
    var example = SwingObserverExample()
    example.go()
}

class SwingObserverExample {
    fun go() {
        var frame = JFrame()
        var button = JButton("Should I do it?")
        button.setSize(100, 100)
        button.addActionListener(AngelListener())
        button.addActionListener(DevilListener())
        frame.contentPane.add(BorderLayout.CENTER, button)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(300, 300)
        frame.isVisible = true
    }
}

class DevilListener : ActionListener {
    override fun actionPerformed(e: ActionEvent?) {
        println("Come on, do it!")
    }

}

class AngelListener : ActionListener {
    override fun actionPerformed(e: ActionEvent?) {
        println("Don't do it, you might regret it!")
    }

}
