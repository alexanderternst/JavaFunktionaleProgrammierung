package s163;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapSum {

	public static void main(String[] args) 
	{
		ArrayList<Widgets> widgets = new ArrayList<>();
		
		widgets.add(new Widgets(178,66));
		widgets.add(new Widgets(188,66));
		widgets.add(new Widgets(198,66));
		widgets.add(new Widgets(168,66));
		
		int i = widgets
				.stream()
				.filter(b -> b.getSize() > 182)
				.mapToInt(b -> b.getWeight())
				.sum();
		
		System.out.println(i);

        List<Widgets> grosse = widgets
                .stream()
                .filter(b -> b.getSize() > 182)
                .collect(Collectors.toList());
        grosse.forEach(b -> System.out.println(b.getSize()));

        System.out.println("------------------");

        widgets
            .stream()
            .forEach(b -> System.out.println(b.getSize()));
	}

}
