package AST.Program.Statement.Component.JSX;

import AST.Program.Node.Node;
import AST.Program.Statement.CallComponent.CallComponent;
import AST.Program.Statement.FunctionCall.FunctionCall;
import AST.Program.Statement.HtmlTag.HtmlTag;
import AST.Program.Statement.IfStatement.IfStatement;
import SymbolTable.SymbolTable;

import java.util.Objects;

public class JSX implements Node {
    String JSX;
    String ComponentName;

    CallComponent callComponent;
    FunctionCall functionCall;
    HtmlTag htmlTag;
    IfStatement ifStatement;

    SymbolTable symbolTable;

    String changeState;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public CallComponent getCallComponent() {
        return callComponent;
    }

    public void setCallComponent(CallComponent callComponent) {
        this.callComponent = callComponent;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public HtmlTag getHtmlTag() {
        return htmlTag;
    }

    public void setHtmlTag(HtmlTag htmlTag) {
        this.htmlTag = htmlTag;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public String getComponentName() {
        return ComponentName;
    }

    public void setComponentName(String componentName) {
        this.ComponentName = componentName;
    }

    public String getJSX() {
        return JSX;
    }

    public void setJSX(String JSX) {
        this.JSX = JSX;
    }


    @Override
    public String toString() {
        return "JSX{\n" +
                (JSX != null ? "JSX='" + JSX + "'\n" : "") +
                (callComponent != null ? callComponent + "\n" : "") +
                (functionCall != null ? functionCall + "\n" : "") +
                (htmlTag != null ? htmlTag + "\n" : "") +
                (ifStatement != null ? ifStatement + "\n" : "") +
                '}' + "\n";
    }


    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (Objects.equals(symbolTable.getRows().get(i).getType(), "changeState") && !symbolTable.getRows().get(i).getValue().contains("set")) {
                this.changeState = symbolTable.getRows().get(i).getValue();
                break;
            }
        }

        if (divAfterJSX) {
            if (callComponent != null) {
                js.append("div.appendChild (\n");
                js.append(callComponent.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, "")).append("\n");

                js.append(")\n");
            }

            if (functionCall != null) {
                js.append(functionCall.generateJs(false, firstDiv, isFatherFunction, fatherName, false, false, "")).append("\n");

            }

            if (ifStatement != null) {
                if (ifStatement.getStatement().get(0).getCallComponent() != null) {
                    js.append(ifStatement.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, true, false, "")).append("\n");
                } else {
                    js.append(ifStatement.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, "")).append("\n");

                }
            }

            if (htmlTag != null) {
                js.append(htmlTag.generateJs(false, true, isFatherFunction, fatherName, false, true, this.changeState)).append("\n");
            }
        } else {
            if (firstDiv) {
                js.append("var div = document.createElement('div');\n");
                if (callComponent != null) {
                    js.append("div.appendChild( \n");
                    js.append(callComponent.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, "")).append("\n");
                    js.append(")\n");
                }

                if (functionCall != null) {
                    js.append(functionCall.generateJs(false, firstDiv, isFatherFunction, fatherName, false, false, "")).append("\n");
                }


                if (ifStatement != null) {
                    if (ifStatement.getStatement().get(0).getCallComponent() != null) {
                        js.append(ifStatement.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, true, false, "")).append("\n");
                    } else {
                        js.append(ifStatement.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, "")).append("\n");
                    }
                }

                if (htmlTag != null) {
                    if (htmlTag.getImg() != null) {
                        js.append(htmlTag.getImg().generateJs(false, false, false, fatherName, false, false, "").trim());
                        js.append("\ndiv.appendChild(img);\n");
                    } else if (htmlTag.getP() != null) {
                        js.append(htmlTag.getP().generateJs(false, false, false, fatherName, false, false, "").trim());
                        js.append("\ndiv.appendChild(p);\n");
                    } else if (htmlTag.getLink() != null) {
                        js.append(htmlTag.getLink().generateJs(false, false, false, fatherName, false, false, "").trim());
                        js.append("\ndiv.appendChild(link);\n");
                    } else {
                        js.append(htmlTag.generateJs(true, true, isFatherFunction, fatherName, false, false, this.changeState)).append("\n");
                    }
                }
            } else {
                js.append("var childDiv = document.createElement('div');\n");
                if (callComponent != null) {
                    js.append("div.appendChild( \n");
                    js.append(callComponent.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, "")).append("\n");
                    js.append(")\n");
                }

                if (functionCall != null) {
                    js.append(functionCall.generateJs(false, firstDiv, isFatherFunction, fatherName, false, false, "")).append("\n");
                }

                if (ifStatement != null) {
                    if (ifStatement.getStatement().get(0).getCallComponent() != null) {
                        js.append(ifStatement.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, true, false, "")).append("\n");
                    } else {
                        js.append(ifStatement.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, "")).append("\n");
                    }
                }

                if (htmlTag != null) {
                    if (htmlTag.getImg() != null) {
                        js.append(htmlTag.generateJs(false, true, isFatherFunction, fatherName, false, false, this.changeState)).append("\n");
                        js.append("\ndiv.appendChild(img);\n");
                    } else if (htmlTag.getP() != null) {
                        js.append(htmlTag.generateJs(false, true, isFatherFunction, fatherName, false, false, this.changeState)).append("\n");
                        js.append("\ndiv.appendChild(p);\n");
                    } else if (htmlTag.getLink() != null) {
                        js.append(htmlTag.generateJs(false, true, isFatherFunction, fatherName, false, false, this.changeState)).append("\n");
                        js.append("\ndiv.appendChild(link);\n");
                    } else {
                        js.append(htmlTag.generateJs(true, true, isFatherFunction, fatherName, false, false, this.changeState)).append("\n");
                    }
                }
            }

            if (Objects.equals(this.getComponentName(), fatherName)) {
                js.append("document.body.appendChild(div); \n");
            } else if (isFatherFunction) {
                js.append("return div;\n");
            }
        }
        return js.toString();

    }

    @Override
    public void checkSemantic() {

    }

}


