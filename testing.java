
import org.python.core.PyFunction;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import java.text.SimpleDateFormat;

public class testing {
    public static void main(String[] args) {
        long startt = System.currentTimeMillis();
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("D:/Project/simulee_test/src/EvolutionaryDetect.py");

        //PyFunction pyFunction = interpreter.get("performance_sync_cudpp_sparseMatrixVectorSetFlags()", PyFunction.class);
        //pyFunction.__call__();
        //System.out.println(pyObject);
        long endt = System.currentTimeMillis();
        System.out.println(endt-startt);

    }
}
