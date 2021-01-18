package edu.ucam.rmi.academia.modelo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerPartition {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestPartitionId.class, TestPartitionDesc.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
