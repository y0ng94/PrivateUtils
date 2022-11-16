## Getting Started

개발 중 사용하기 용이한 유틸성 프로그램들을 보관하기 위해 만든 프로젝트

## Folder Structure

- `src`     : 소스 코드를 관리하는 디렉토리
- `target`  : Maven 플러그인과 소스를 컴파일한 Class 파일을 관리하는 디렉토리

## Dependency Management
- 'yn.minor.module.ConnectionPool'    : Jdk 1.6, Jdbc driver
- 'yn.minor.util.CommonUtil'          : Jdk 1.6
- 'yn.minor.util.Config'              : Jdk 1.6
- 'yn.minor.util.TablePrinterUtil'    : Jdk 1.6

- 'yn.util.CommonUtil'                : Jdk 1.8
- 'yn.util.Config'                    : Jdk 1.8
- 'yn.util.JsonUtil'                  : Jdk 1.8, jackson-core, jackson-databind, jackson-annotations
- 'yn.util.LogUtil'                   : slf4j, Log library
- 'yn.util.TablePrinterUtil'          : Jdk 1.8

## Code Explaination
- 'yn.minor.module.ConnectionPool'    : Database 커넥션 풀을 Pure Java 모듈에서 관리 유틸리티
- 'yn.minor.util.CommonUtil'          : 공통적으로 사용 가능한 유틸리티
- 'yn.minor.util.Config'              : Pure Java 모듈에서 Property를 로드 및 관리하기 위한 유틸리티
- 'yn.minor.util.TablePrinterUtil'    : Pure Java 모듈에서 테이블 형태의 데이터를 출력하기 위한 유틸리티

- 'yn.util.CommonUtil'                : 공통적으로 사용 가능한 유틸리티
- 'yn.util.Config'                    : Pure Java 모듈에서 Property를 로드 및 관리하기 위한 유틸리티
- 'yn.util.JsonUtil'                  : Json 데이터를 효율적으로 관리하기 위한 유틸리티
- 'yn.util.LogUtil'                   : 로그 출력에 있어서 MessageFormat을 이용한 파라미터 입력을 지원하는 유틸리티
- 'yn.util.TablePrinterUtil'          : Pure Java 모듈에서 테이블 형태의 데이터를 출력하기 위한 유틸리티