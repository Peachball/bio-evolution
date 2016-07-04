import java.util.ArrayList;

public abstract class Creature {
	int stat;
	int generation;
	boolean is_hungry;
	int coordX;
	int coordY;

	public Creature(int stat, int generation, Board board, int coordX, int coordY) {
		this.stat = stat;
		this.generation = generation;
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public abstract void eat(ArrayList<Creature> cellmates);

	public abstract boolean canSurvive(int generation);

	public abstract Creature[] reproduce();

	public void reposition(int coordX, int coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
	}
}
