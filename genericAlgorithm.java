public class genericAlgorithm {
    private int populationSize;         // a set of indivuals
    private double mutationChance;
    private int numberGeneration;
    private int population[];
    genericAlgorithm(){
        this.populationSize = 10000;
        this.numberGeneration = 35;
        this.mutationChance = .03;
        this.population = new int [10];
    }

    public int fitnessFN(int indiviual){
        // accepts the individual as an argument and returns
        // it's fitness value ( the total distance)
        return 0;
    }

    public int [] geneticAlgorithm(){
        // population is a set of individuals
        // FitnessFn: A function that measure the fitness of an individual

        return this.population;
    }
    public int randomSelection(int Population){
        // accepts the population as it's only argument. Uses the Fitnessfn to judge
        // fitness of the individual.

        return 0;
    }

    public void Reproduce(int a, int b){
        // a & B are parent individuls
        // Accepts two indiviuals as it's only argument and performs the
        // crossover, creating and returning the child individual which gets
        // placed in the new population.
    }

    public void mutate(int a){

        // mutates the indivial in some way, returning the mutated indivual
    }


}
