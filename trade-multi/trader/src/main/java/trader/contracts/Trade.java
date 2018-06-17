package trader.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple9;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.4.0.
 */
public class Trade extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50611287806100206000396000f3006080604052600436106100ae5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166305e54f7f81146100b357806312b6eb36146101515780632802d4751461017d5780633733b9b4146101e257806347b47208146101fa57806366c9913914610221578063903b1ac2146102395780639740b1bc146102515780639ace38c214610495578063a50c40f6146104ad578063f605ad7a146104c5575b600080fd5b3480156100bf57600080fd5b5060408051602060046024803582810135601f810185900485028601850190965285855261014f95833595369560449491939091019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a9998810197919650918201945092508291508401838280828437509497506106289650505050505050565b005b34801561015d57600080fd5b50610169600435610693565b604080519115158252519081900360200190f35b34801561018957600080fd5b506101926106a6565b60408051602080825283518183015283519192839290830191858101910280838360005b838110156101ce5781810151838201526020016101b6565b505050509050019250505060405180910390f35b3480156101ee57600080fd5b506101926004356106ff565b34801561020657600080fd5b5061020f610794565b60408051918252519081900360200190f35b34801561022d57600080fd5b5061020f60043561079a565b34801561024557600080fd5b5061020f6004356107b9565b34801561025d57600080fd5b50610269600435610821565b604051808a8152602001806020018060200180602001806020018981526020018881526020018781526020018060200186810386528e818151815260200191508051906020019080838360005b838110156102ce5781810151838201526020016102b6565b50505050905090810190601f1680156102fb5780820380516001836020036101000a031916815260200191505b5086810385528d5181528d516020918201918f019080838360005b8381101561032e578181015183820152602001610316565b50505050905090810190601f16801561035b5780820380516001836020036101000a031916815260200191505b5086810384528c5181528c516020918201918e019080838360005b8381101561038e578181015183820152602001610376565b50505050905090810190601f1680156103bb5780820380516001836020036101000a031916815260200191505b5086810383528b5181528b516020918201918d019080838360005b838110156103ee5781810151838201526020016103d6565b50505050905090810190601f16801561041b5780820380516001836020036101000a031916815260200191505b50868103825287518152875160209182019189019080838360005b8381101561044e578181015183820152602001610436565b50505050905090810190601f16801561047b5780820380516001836020036101000a031916815260200191505b509e50505050505050505050505050505060405180910390f35b3480156104a157600080fd5b50610269600435610bc9565b3480156104b957600080fd5b50610192600435610ec6565b3480156104d157600080fd5b5060408051602060046024803582810135601f810185900485028601850190965285855261014f95833595369560449491939091019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020888301358a018035601f8101839004830284018301909452838352979a89359a8a8301359a91999098506060909101965091945090810192508190840183828082843750949750610fc09650505050505050565b61063183610693565b151561063c57600080fd5b6000838152600160208181526040909220845161066193919092019190850190611176565b506000838152600160209081526040909120426007820155825161068d92600890920191840190611176565b50505050565b6000818152600160205260409020541490565b606060028054806020026020016040519081016040528092919081815260200182805480156106f457602002820191906000526020600020905b8154815260200190600101908083116106e0575b505050505090505b90565b606060008060606000610710610794565b9350858403925085604051908082528060200260200182016040528015610741578160200160208202803883390190505b5091508290505b8381101561078b57600280548290811061075e57fe5b90600052602060002001548284830381518110151561077957fe5b60209081029091010152600101610748565b50949350505050565b60025490565b60028054829081106107a857fe5b600091825260209091200154905081565b6000806000806107c7610794565b92506000199150600090505b8281101561080b5760028054829081106107e957fe5b90600052602060002001548514156108035780915061080b565b6001016107d3565b600082121561081957600080fd5b509392505050565b6000606080606080600080600060606108386111f4565b6108418b610693565b151561084c57600080fd5b60008b8152600160208181526040928390208351610120810185528154815281840180548651600296821615610100026000190190911695909504601f810185900485028601850190965285855290949193858401939092908301828280156108f65780601f106108cb576101008083540402835291602001916108f6565b820191906000526020600020905b8154815290600101906020018083116108d957829003601f168201915b5050509183525050600282810180546040805160206001841615610100026000190190931694909404601f810183900483028501830190915280845293810193908301828280156109885780601f1061095d57610100808354040283529160200191610988565b820191906000526020600020905b81548152906001019060200180831161096b57829003601f168201915b505050918352505060038201805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152938201939291830182828015610a1c5780601f106109f157610100808354040283529160200191610a1c565b820191906000526020600020905b8154815290600101906020018083116109ff57829003601f168201915b505050918352505060048201805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152938201939291830182828015610ab05780601f10610a8557610100808354040283529160200191610ab0565b820191906000526020600020905b815481529060010190602001808311610a9357829003601f168201915b50505050508152602001600582015481526020016006820154815260200160078201548152602001600882018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610b705780601f10610b4557610100808354040283529160200191610b70565b820191906000526020600020905b815481529060010190602001808311610b5357829003601f168201915b505050505081525050905080600001519950806020015198508060400151975080606001519650806080015195508060a0015194508060c0015193508060e0015192508061010001519150509193959799909294969850565b600160208181526000928352604092839020805481840180548651600296821615610100026000190190911695909504601f81018590048502860185019096528585529094919392909190830182828015610c655780601f10610c3a57610100808354040283529160200191610c65565b820191906000526020600020905b815481529060010190602001808311610c4857829003601f168201915b50505060028085018054604080516020601f6000196101006001871615020190941695909504928301859004850281018501909152818152959695945090925090830182828015610cf75780601f10610ccc57610100808354040283529160200191610cf7565b820191906000526020600020905b815481529060010190602001808311610cda57829003601f168201915b5050505060038301805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152949594935090830182828015610d875780601f10610d5c57610100808354040283529160200191610d87565b820191906000526020600020905b815481529060010190602001808311610d6a57829003601f168201915b5050505060048301805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152949594935090830182828015610e175780601f10610dec57610100808354040283529160200191610e17565b820191906000526020600020905b815481529060010190602001808311610dfa57829003601f168201915b505050600584015460068501546007860154600887018054604080516020601f60026000196101006001881615020190951694909404938401819004810282018101909252828152989995989497509295509091830182828015610ebc5780601f10610e9157610100808354040283529160200191610ebc565b820191906000526020600020905b815481529060010190602001808311610e9f57829003601f168201915b5050505050905089565b6060600080600060606000610eda876107b9565b9450610ee4610794565b9350610f406002805480602002602001604051908101604052809291908181526020018280548015610f3557602002820191906000526020600020905b815481526020019060010190808311610f21575b50505050508861111a565b925082604051908082528060200260200182016040528015610f6c578160200160208202803883390190505b5091508490505b83811015610fb6576002805482908110610f8957fe5b906000526020600020015482868303815181101515610fa457fe5b60209081029091010152600101610f73565b5095945050505050565b610fc86111f4565b50604080516101208101825289815260208082018a81528284018a9052606083018990526080830188905260a0830187905260c083018690524260e0840152610100830185905260008c81526001808452949020805484518255915180519495928e14948694929361103f93908501920190611176565b506040820151805161105b916002840191602090910190611176565b5060608201518051611077916003840191602090910190611176565b5060808201518051611093916004840191602090910190611176565b5060a0820151600582015560c0820151600682015560e0820151600782015561010082015180516110ce916008840191602090910190611176565b50505080151561110e57600280546001810182556000919091527f405787fa12a823e0f2b7631cc41b3ba8828b3321ca811111fa75cd3aa3bb5ace018a90555b50505050505050505050565b60008080805b855181101561116c578115801561114d575084868281518110151561114157fe5b90602001906020020151145b1561115757600191505b8115611164576001909201915b600101611120565b5090949350505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106111b757805160ff19168380011785556111e4565b828001600101855582156111e4579182015b828111156111e45782518255916020019190600101906111c9565b506111f0929150611241565b5090565b610120604051908101604052806000815260200160608152602001606081526020016060815260200160608152602001600081526020016000815260200160008152602001606081525090565b6106fc91905b808211156111f057600081556001016112475600a165627a7a72305820d46befd767f1ef36f4a0472be8590b2dcac38d2eb26257e05b824f8fea250de70029";

    public static final String FUNC_UPDATETRANSTATUS = "updateTranStatus";

    public static final String FUNC_CHECKTRANEXISTS = "checkTranExists";

    public static final String FUNC_GETTRANSLIST = "getTransList";

    public static final String FUNC_GETTRANSLISTBYSIZE = "getTransListBySize";

    public static final String FUNC_GETTRANSLENGTH = "getTransLength";

    public static final String FUNC_TRANS = "trans";

    public static final String FUNC_FINDTRANPOSITION = "findTranPosition";

    public static final String FUNC_GETTRAN = "getTran";

    public static final String FUNC_TRANSACTIONS = "transactions";

    public static final String FUNC_GETTRANSLISTFROMTRANID = "getTransListFromTranId";

    public static final String FUNC_UPDATETRAN = "updateTran";

    protected Trade(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Trade(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> updateTranStatus(BigInteger _tranid, String _status, String _user) {
        final Function function = new Function(
                FUNC_UPDATETRANSTATUS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tranid), 
                new org.web3j.abi.datatypes.Utf8String(_status), 
                new org.web3j.abi.datatypes.Utf8String(_user)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> checkTranExists(BigInteger _tranid) {
        final Function function = new Function(FUNC_CHECKTRANEXISTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tranid)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<List> getTransList() {
        final Function function = new Function(FUNC_GETTRANSLIST, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<List> getTransListBySize(BigInteger size) {
        final Function function = new Function(FUNC_GETTRANSLISTBYSIZE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(size)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<BigInteger> getTransLength() {
        final Function function = new Function(FUNC_GETTRANSLENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> trans(BigInteger param0) {
        final Function function = new Function(FUNC_TRANS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> findTranPosition(BigInteger tranid) {
        final Function function = new Function(FUNC_FINDTRANPOSITION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tranid)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple9<BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, String>> getTran(BigInteger _tranid) {
        final Function function = new Function(FUNC_GETTRAN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tranid)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Int256>() {}, new TypeReference<Int256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<Tuple9<BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, String>>(
                new Callable<Tuple9<BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, String>>() {
                    @Override
                    public Tuple9<BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple9<BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, String>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (String) results.get(2).getValue(), 
                                (String) results.get(3).getValue(), 
                                (String) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue(), 
                                (BigInteger) results.get(6).getValue(), 
                                (BigInteger) results.get(7).getValue(), 
                                (String) results.get(8).getValue());
                    }
                });
    }

    public RemoteCall<Tuple9<BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, String>> transactions(BigInteger param0) {
        final Function function = new Function(FUNC_TRANSACTIONS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Int256>() {}, new TypeReference<Int256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<Tuple9<BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, String>>(
                new Callable<Tuple9<BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, String>>() {
                    @Override
                    public Tuple9<BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple9<BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, String>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (String) results.get(2).getValue(), 
                                (String) results.get(3).getValue(), 
                                (String) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue(), 
                                (BigInteger) results.get(6).getValue(), 
                                (BigInteger) results.get(7).getValue(), 
                                (String) results.get(8).getValue());
                    }
                });
    }

    public RemoteCall<List> getTransListFromTranId(BigInteger tranid) {
        final Function function = new Function(FUNC_GETTRANSLISTFROMTRANID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tranid)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<TransactionReceipt> updateTran(BigInteger _tranid, String _status, String _account, String _asset, String _location, BigInteger _quantity, BigInteger _amount, String _user) {
        final Function function = new Function(
                FUNC_UPDATETRAN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tranid), 
                new org.web3j.abi.datatypes.Utf8String(_status), 
                new org.web3j.abi.datatypes.Utf8String(_account), 
                new org.web3j.abi.datatypes.Utf8String(_asset), 
                new org.web3j.abi.datatypes.Utf8String(_location), 
                new org.web3j.abi.datatypes.generated.Int256(_quantity), 
                new org.web3j.abi.datatypes.generated.Int256(_amount), 
                new org.web3j.abi.datatypes.Utf8String(_user)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Trade> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Trade.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Trade> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Trade.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static Trade load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Trade(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Trade load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Trade(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
