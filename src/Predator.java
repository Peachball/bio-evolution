import java.util.ArrayList;

public class Predator extends Creature {

	public Predator(int stat, int generation, Board board, int coordX, int coordY) {
		super(stat, generation, board, coordX, coordY);
	}

	@Override
	public void eat(ArrayList<Creature> cellmates) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canSurvive(int generation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Creature[] reproduce() {
		// TODO Auto-generated method stub
		return null;
	}

}
