package edu.unc.vaclab.ir;

import java.util.List;

import org.apache.commons.json.JSONException;
import org.apache.commons.json.JSONObject;

public class FoldedResult<T> {

	private T aggregateResult;
	private List<T> foldResults;
	
	public FoldedResult(T aggregate_result, List<T> fold_results) {
		aggregateResult = aggregate_result;
		foldResults = fold_results;
	}
	
	public T getAggregateResult() {
		return aggregateResult;
	}
	
	public int getFoldCount() {
		return foldResults.size();
	}
	
	public T getFoldResult(int fold_num) {
		return foldResults.get(fold_num);
	}
}
