package BloombergOnsite;

public class mostPeopleYear {
	public static int livingPeople(Set<Person> people) {
	    final int[] births = new int[300];
	    final int[] deaths = new int[300];
	    for (Person person : people) {
	      births[person.birthYear-1900]++;
	      deaths[person.deathYear-1900]++;
	    }

	    int maxPop = 0;
	    int population = 0;
	    int yearOffset = 0;
	    for (int i = 0; i < 300; i++) {
	      population += births[i];
	      if (maxPop < population) {
	        maxPop = population;
	        yearOffset = i;
	      }
	      population -= deaths[i];
	    }
	    return 1900 + yearOffset;
	  }
}
