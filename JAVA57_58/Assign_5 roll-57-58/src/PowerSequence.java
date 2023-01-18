package series;

public class PowerSequence extends Sequence implements Resetable{

public double current;
public float factor;

public PowerSequence(float ratio){
	factor = ratio;
}

public double Next(){
	double term = current;
	current *= factor;
	return term;
}

public void Reset(){
	current = 1;
}

}
