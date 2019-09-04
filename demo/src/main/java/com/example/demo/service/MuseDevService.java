package com.example.demo.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EvaluatedStrings;
import com.example.demo.dao.MuseDevDAO;

@Service
public class MuseDevService {

	public MuseDevDAO museDevMainService(String input) {

		MuseDevDAO museDevDAO = new MuseDevDAO();

		if (input.equals("version")) {

			museDevDAO.setVersion(1L);
			return museDevDAO;

		} else if (input.equals("applicable")) {

			museDevDAO.setApplicable(true);
			return museDevDAO;

		} else if (input.startsWith("# ")) {

			String[] result = input.split("\\r?\\n");

			List<EvaluatedStrings> evaluatedStringsList = new LinkedList<>();

			for (int i = 1; i < result.length; i++) {

				// Bad design below see if I can make it more readable.

				if (result[i].contains("unicorn")) {

					EvaluatedStrings evaluatedStrings = new EvaluatedStrings();
					evaluatedStrings.setFile(result[0]);
					evaluatedStrings.setType("Distracting words");
					evaluatedStrings.setMessage("The word 'unicorn' was used.");
					evaluatedStrings.setLine(i);
					evaluatedStringsList.add(evaluatedStrings);

				} else if (result[i].contains("FIXME")) {

					EvaluatedStrings evaluatedStrings = new EvaluatedStrings();
					evaluatedStrings.setFile(result[0]);
					evaluatedStrings.setType("Distracting words");
					evaluatedStrings.setMessage("The word 'FIXME' was used.");
					evaluatedStrings.setLine(i);
					evaluatedStringsList.add(evaluatedStrings);

				} else if (result[i].contains("santa")) {

					EvaluatedStrings evaluatedStrings = new EvaluatedStrings();
					evaluatedStrings.setFile(result[0]);
					evaluatedStrings.setType("Distracting words");
					evaluatedStrings.setMessage("The word 'santa' was used.");
					evaluatedStrings.setLine(i);
					evaluatedStringsList.add(evaluatedStrings);

				} else if (result[i].contains("cake")) {

					EvaluatedStrings evaluatedStrings = new EvaluatedStrings();
					evaluatedStrings.setFile(result[0]);
					evaluatedStrings.setType("Distracting words");
					evaluatedStrings.setMessage("The word 'cake' was used.");
					evaluatedStrings.setLine(i);
					evaluatedStringsList.add(evaluatedStrings);
				}

				if (result[i].contains("burp")) {

					EvaluatedStrings evaluatedStrings = new EvaluatedStrings();
					evaluatedStrings.setFile(result[0]);
					evaluatedStrings.setType("Foul words");
					evaluatedStrings.setMessage("The word 'burp' was used.");
					evaluatedStrings.setLine(i);
					evaluatedStringsList.add(evaluatedStrings);

				} else if (result[i].contains("meanie")) {

					EvaluatedStrings evaluatedStrings = new EvaluatedStrings();
					evaluatedStrings.setFile(result[0]);
					evaluatedStrings.setType("Foul words");
					evaluatedStrings.setMessage("The word 'meanie' was used.");
					evaluatedStrings.setLine(i);
					evaluatedStringsList.add(evaluatedStrings);

				} else if (result[i].contains("TODO")) {

					EvaluatedStrings evaluatedStrings = new EvaluatedStrings();
					evaluatedStrings.setFile(result[0]);
					evaluatedStrings.setType("Foul words");
					evaluatedStrings.setMessage("The word 'TODO' was used.");
					evaluatedStrings.setLine(i);
					evaluatedStringsList.add(evaluatedStrings);
				}
			}
			museDevDAO.setEvaluatedStrings(evaluatedStringsList);
			return museDevDAO;
		}
		return null;
	}
}
