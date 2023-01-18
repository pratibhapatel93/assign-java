package series;

public class LinearSequence extends Sequence{

public double current;
public float step;

public LinearSequence(double _current,float _step){
	current = _current;
	step = _step;
}

public double Next(){
	double term=current;
	current += step;
	return term;
}

}
