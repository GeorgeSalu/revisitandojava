package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane {

	public TesteGridPane() {
		Caixa c1 = new Caixa().comTexto("1");
		
		setGridLinesVisible(true);
		
		getColumnConstraints().addAll(cc(),cc(),cc(),cc(),cc());
		getRowConstraints().addAll(rc(),rc(),rc(),rc(),rc());
		
		add(c1, 0, 0, 2, 1);
	}
	
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20);
		cc.setFillWidth(true);
		return cc;
	}
	
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}
	
}
