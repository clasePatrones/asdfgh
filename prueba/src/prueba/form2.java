package prueba;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class form2 {

	protected Shell shell;
	private Text txtUrl;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			form2 window = new form2();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(502, 438);
		shell.setText("SWT Application");
		
		txtUrl = new Text(shell, SWT.BORDER);
		txtUrl.setBounds(50, 10, 337, 21);
		
		Label lblUrl = new Label(shell, SWT.NONE);
		lblUrl.setBounds(25, 13, 55, 15);
		lblUrl.setText("url:");
		
		Browser browser = new Browser(shell, SWT.NONE);
		browser.setBounds(10, 65, 466, 325);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.setUrl(txtUrl.getText());
				
			}
		});
		btnNewButton.setBounds(10, 34, 75, 25);
		btnNewButton.setText("Ir");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.refresh();
			}
		});
		btnNewButton_1.setBounds(91, 34, 75, 25);
		btnNewButton_1.setText("Actualizar");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.back();
			}
		});
		btnNewButton_2.setBounds(175, 34, 75, 25);
		btnNewButton_2.setText("Retroceder");
		
		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.forward(); 
			}
		});
		btnNewButton_3.setBounds(256, 34, 75, 25);
		btnNewButton_3.setText("Avanzar");

	}
}
