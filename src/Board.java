import java.util.ArrayList;
import java.util.Random;

public class Board {
	int sizeX;
	int sizeY;
	int generation;
	ArrayList<Predator> predators;
	ArrayList<Prey> prey;
	Random rand;

	public Board(int sizeX, int sizeY, int startingCountEach, int startingLowerBounds, int startingUpperBounds) {
		rand = new Random();
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.generation = 0;
		predators = new ArrayList<Predator>();
		populatePredators(startingCountEach, startingLowerBounds, startingUpperBounds);
		prey = new ArrayList<Prey>();
		populatePrey(startingCountEach, startingLowerBounds, startingUpperBounds);
	}

	public void checkSurvivors() {
	}

	public void redistribute() {
	}

	private void populatePredators(int number, int lowerBounds, int upperBounds) {
		for (int i = 0; i < number; i++) {
			Predator newpred = new Predator(rand.nextInt(upperBounds - lowerBounds) + lowerBounds, 
					generation, 
					this, 
					rand.nextInt(sizeX), 
					rand.nextInt(sizeY));
			predators.add(newpred);
		}
	}

	private void populatePrey(int number, int lowerBounds, int upperBounds) {
		for (int i = 0; i < number; i++) {
			Prey newprey = new Prey(rand.nextInt(upperBounds - lowerBounds) + lowerBounds, 
					generation, 
					this, 
					rand.nextInt(sizeX), 
					rand.nextInt(sizeY));
			prey.add(newprey);
		}
	}
}
