protoc -I=pb2 --java_out=java_out \
    pb2/field_rules_test.proto \
    pb2/field_types_test.proto \
    pb2/default_values_test.proto \
    pb2/enums_test.proto \
    pb2/enum_allowing_alias_test.proto \
    pb2/options_test.proto \
    pb2/nested_types_test.proto
