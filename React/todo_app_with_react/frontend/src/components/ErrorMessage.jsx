const ErrorMessage = ({ error }) => {
  if (!error) return null;

  return (
    <div className="bg-red-50 border border-red-200 text-red-700 px-4 py-3 rounded-lg mb-6">
      {error}
    </div>
  );
};

export default ErrorMessage;
