import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val voltageInput: EditText = findViewById(R.id.voltageInput)
        val impedanceInput: EditText = findViewById(R.id.impedanceInput)
        val calculateButton: Button = findViewById(R.id.calculateButton)
        val resultView: TextView = findViewById(R.id.resultView)

        calculateButton.setOnClickListener {
            val voltage = voltageInput.text.toString().toDoubleOrNull()
            val impedance = impedanceInput.text.toString().toDoubleOrNull()

            if (voltage != null && impedance != null && impedance != 0.0) {
                val threePhaseCurrent = calculateThreePhaseShortCircuitCurrent(voltage, impedance)
                val singlePhaseCurrent = calculateSinglePhaseShortCircuitCurrent(voltage, impedance)

                resultView.text = "Трифазний струм КЗ: $threePhaseCurrent A\nОднофазний струм КЗ: $singlePhaseCurrent A"
            } else {
                resultView.text = "Будь ласка, введіть коректні значення!"
            }
        }
    }

    // Функція для розрахунку трифазного струму КЗ
    private fun calculateThreePhaseShortCircuitCurrent(voltage: Double, impedance: Double): Double {
        return voltage / (Math.sqrt(3.0) * impedance)
    }

    // Функція для розрахунку однофазного струму КЗ
    private fun calculateSinglePhaseShortCircuitCurrent(voltage: Double, impedance: Double): Double {
        return voltage / impedance
    }
}
