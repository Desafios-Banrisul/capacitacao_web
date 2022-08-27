package TestsSuites;

import TestCases.RealizarCompraComSucesso;
import TestCases.RealizarCompraComSucessoCSV;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({RealizarCompraComSucesso.class, RealizarCompraComSucessoCSV.class})
public class SucessTest {
}
