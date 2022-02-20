package singletonDesignPatternExample;

/**
 * @author Hammad: 20-Feb-2022
 */
public class App {

	public static void main(String[] args) {
		PerformanceStage stage = PerformanceStage.getInstance();
		PerformanceStage stage2 = PerformanceStage.getInstance();
		PerformanceStage stage3 = PerformanceStage.getInstance();
		PerformanceStage stage4 = PerformanceStage.getInstance();
		PerformanceStage stage5 = PerformanceStage.getInstance();
		PerformanceStage stage6 = PerformanceStage.getInstance();

		stage.turnOnLights();
		System.out.println(stage6.getCounter());
	}
}
