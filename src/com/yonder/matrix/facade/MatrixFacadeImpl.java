package com.yonder.matrix.facade;

import java.util.List;

import javax.ejb.EJB;

import com.yonder.matrix.dao.MatrixDAOImpl;
import com.yonder.matrix.model.Matrix;

public class MatrixFacadeImpl implements MatrixFacade {

	@EJB
	private MatrixDAOImpl matrixDAO;

	@Override
	public void save(Matrix matrix) {
		isMatrixWithAllData(matrix);

		matrixDAO.save(matrix);

	}

	@Override
	public Matrix update(Matrix matrix) {
		isMatrixWithAllData(matrix);
		
		return matrixDAO.update(matrix);
	}
	
	@Override
	public void delete(Matrix matrix) {
		matrixDAO.delete(matrix.getId());
		
	}

	@Override
	public Matrix find(int entityID) {
		
		return matrixDAO.find(entityID);
	}

	@Override
	public List<Matrix> findAll() {
		
		return matrixDAO.findAll();
	}

	private void isMatrixWithAllData(Matrix matrix) {
		boolean hasError = false;

		if (matrix == null) {
			hasError = true;
		}

		if (matrix.getArea() == null || "".equals(matrix.getArea().trim())) {
			hasError = true;
		}

		if (matrix.getTopic() == null || "".equals(matrix.getTopic().trim())) {
			hasError = true;
		}

		if (hasError) {
			throw new IllegalArgumentException(
					"The matrix is missing data. Check the area and topic, they should have value.");
		}
	}

}
